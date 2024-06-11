const todo = {
  id: 0,
  data: [], // 스케줄 데이터
  tp1: "", //스케줄 목록 템플릿 HTML
  parser: null,

  getItem(subject) {
    let html = this.tpl;
    html = html.replace(/#subject/g, subject).replace(/#id/g, ++this.id); // 메서드 체이닝
    const dom = this.parser.parseFromString(html, "text/html");

    console.log(dom);
    
    const liEl = dom.querySelector("li");
    const buttonEl = liEl.querySelector("button");
    
    buttonEl.addEventListener("click", function () {
      const itemsEl = document.querySelector(".items");
      itemsEl.removeChild(liEl);

      // localStorage에 저장된 데이터도 삭제
      const id = Number(liEl.dataset.id);
      const index = todo.data.findIndex((item) => item.id === id);
      if (index !== -1) {
        todo.data.splice(index, 1);
        todo.save();
      }
    });

    return liEl;
  },

  init() {
    //스케줄목록 템플릿 가져오기
    const tpEl = document.getElementById("tpl");
    this.tpl = tpEl.innerHTML;
    this.parser = new DOMParser();

    // 저장값 조회 -> 스케줄 완성
    const jsonData = localStorage.getItem("todos");
    const todos = jsonData ? JSON.parse(jsonData) : []; //jsonData undefined 인지 체크먼저..
    this.data = todos;
    this.id = todos.length;

    const itemsEl = document.querySelector(".items");
      
    for (const item of todos) {
      // symbol.iterator 반복자 패턴
      const LiEl = this.getItem(item.title);
      //LiEl.dataset.id = item.id;
      itemsEl.appendChild(LiEl);
    }
  },
  /**
   * 스케줄 추가
   */
  add() {
    const subject = frmRegist.subject.value;

    if (!subject.trim()) {
      alert("할일을 입력하세요.");
      return;
    }
    const itemsEl = document.querySelector(".items");
    const liEl = this.getItem(subject);
    itemsEl.appendChild(liEl);

    frmRegist.subject.value = "";
    frmRegist.subject.focus();

    let { data } = this;
    let id = this.id;
    data.push({
      id,
      title: subject,
    });
    this.save();
  },

  save() {
    localStorage.setItem("todos", JSON.stringify(this.data));
  },
};

window.addEventListener("DOMContentLoaded", function () {
  todo.init(); //데이터 조회 및 완성

  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();
    todo.add(); //스케줄 추가
  });
});
