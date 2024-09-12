import Button1 from "./colorButton/Button1";

export default function LightSwitch() {

  function handleClick() {
    let bodyStyle = document.body.style;
    if (bodyStyle.backgroundColor === "black") {
      bodyStyle.backgroundColor = "white";
    } else {
      bodyStyle.backgroundColor = "black";
    }
  }

  return <Button1 onClick={handleClick}>Toggle the lights</Button1>;
}
