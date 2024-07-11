data = {"name": "이이름", "age": 40 }
a = f"이름: {data['name']}, 나이 : {data['age']}"  # 딕셔너리
print(a)

a = "abc1234def"
b = a.find('2')   # 4  : 위치찾기
print(b)

b = a.find('9')   # -1 : 못찾으면
print(b)

a = "abc1234def"
b = a.index('2')   # 4  : 위치찾기
print(b)

b = a.index('9')   # error : 못찾으면
print(b)

a = ("  abc  ").strip()  # abc
print(a)



