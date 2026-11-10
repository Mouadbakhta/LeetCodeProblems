class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        s=str(x)
        if(x>0):
            result = int(s[::-1])
            if result >= (-1*(2**31)) and result <= (2**31 - 1): return result 
            return 0
        else : 
            x=-1*x 
            st = str(x)
            result = int(st[::-1])
            if result >= (-1*(2**31)) and result <= (2**31 - 1): return -1*result
            return 0
        
        