# 2869 달팽이는 올라가고 싶다(기본수학1)
A,B,V = map(int,input().split())
d = (V-B) / (A-B)  # 걸리는 일수 = 올라가야하는 높이 / 하루동안 등반하는(낮에 올라갔다 밤에 내려오는) 높이

# 만약 걸리는 일수가 소수점이 안 나오면(딱 맞아 떨어지면 그대로 출력 / 아니면 4.2일 같은 날은 1일이 더 걸리므로 +1)
print((int(d) if int(d) == d else int(d)+1)) 


