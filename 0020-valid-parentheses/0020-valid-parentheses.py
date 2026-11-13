class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        hash_map = {'(':')','{':'}','[':']'}
        for char in s :
            if char  in hash_map :
                stack.append(char)
            else : 
                if not stack : return False
                if char == hash_map[stack[-1]] :
                    stack.pop()
                else : 
                    return False 
        return len(stack) == 0 