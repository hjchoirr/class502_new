a = [1,2,3]
b = a.copy()
a[0] = 100
print(b)

a = ['AA','BB','CC', 'DD', 'EE']
del a[0]
print(a)

print(type(a[0]))
#b =  a[0] + 100  ## ERROR
b = a[0] + str(100)

print(b)








