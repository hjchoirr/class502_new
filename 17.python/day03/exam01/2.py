a = 'Pithon'
b = a[0] + 'y' + a[2:]   # Python
print(b)


a = "ABC"
print(id(a))  # 문자열 a의 주소 140706637937960


a = a + "1234"  # 다른 주소의 새 문자열 생성됨
print(a)     # ABC1234
print(id(a)) # 2715684060880


a = "I eat %d apples." % 10
print(a)  # I eat 10 apples.

a = "I eat %s apples." % "ten"
print(a) # I eat 10 apples.

a = "%s litte, %s litte indians." % ("one", "two")
print(a)    # one litte, two litte indians.


a = "one"
b = "two"

c = "%s litte, %s litte indians." % (a, b)
print(c) # one litte, two litte indians.


a = 100
b = "스프링 %d%% 이해" % 100
print(b)  # 스프링 100% 이해

a = """나는
여러줄
스트링"""
print(a)
"""print(a)
"""
