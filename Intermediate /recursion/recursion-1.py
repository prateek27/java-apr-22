def inc(n):
	if n==0:
		return 
	
	inc(n-1)
	print(n)
	

def dec(n):
	if n==0:
		return 
	
	
	print(n)	
	dec(n-1)
	
	
def tiles(n):
	if n==1 or n==0:
		return 1
		
	ans = tiles(n-1) + tiles(n-2)
	return ans
	
print(tiles(5))
