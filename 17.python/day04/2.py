a = "I love {0} students".format(24)
print(a)

a = "I love {0} students".format("스물 넷")
print(a)

a = "I like {0} and {1}".format("java","python")
print(a)

a = "I have {number} pens and {days} days".format(number=10, days=5)
print(a)

a = "({0:<10})".format("AB")   # (AB        )
print(a)

a = "({0:>10})".format("AB")   # (        AB)
print(a)

a = "({0:*^11})".format("AB")   # (    AB    )
print(a)

a = "({0:*<10})".format("AB")   # (AB********)
print(a)


a = "{{{0:0.4f}}}".format(10.12345678)   # {10.1235}
print(a)

a = "{{0:0.4f}}".format(10.12345678)   # {0:0.4f}
print(a)


name = "이이름"
age = 40
a = f'이름:{name}, 나이:{age}'
print(a)
