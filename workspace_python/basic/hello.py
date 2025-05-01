print('Hello,world!')

a = 10
print(a)

b = (0,2,5,4,3,5)

# for a in b:
    # print(a*2)

# 한줄주석
"""
asdasd
"""
'''
여러줄주석
'''
a = '''asdasdasd'''
print(a)

a=21
d = 9 < a <20
print(d)      

# print(5/0)
# print(5/2) 나누기
# print(5//2) 나눈후 소수점 버림 
print("-" * 10)

a = 10
#  a++
--a # 그냥 * -1 *-1

print(str(2)+"a")
print("-" * 10)

a = 5
b = 10
if a > b :
    print("a가b보다 크다")
elif a == b:
    print("난깍두기")
else:
    # print("b가 크다")
    # print("b가 크다")
    pass


    
for i in range(10):
    print(i)

a= 100
def test() :
    global a
    print(a)
    a=200

test()
print("a",a)