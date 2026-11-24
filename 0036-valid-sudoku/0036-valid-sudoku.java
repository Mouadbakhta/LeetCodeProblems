class Solution {
    public boolean isValidSudoku(char[][] board) {
        int length = 8 ;
        boolean fC = true ;
        boolean sC = true ;
        boolean tC = true;
        

        for (int i = 0 ; i <= length ; i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for (int j = 0 ; j <= length ; j++){
                if (Character.isDigit(board[i][j])){
                    if (map.containsKey(board[i][j])){
                        map.put(board[i][j] , map.get(board[i][j]) + 1);
                    }else {
                        map.put(board[i][j] , 1);
                    }
                    for(Map.Entry<Character,Integer> entry : map.entrySet()){
                        if(entry.getValue() > 1 ){
                            return false ;
                        }
                    fC = true ; 
                    }
                }else {continue;} 
            }
        }
        for (int i = 0 ; i <= length ; i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for (int j = 0 ; j <= length ; j++){
                if (Character.isDigit(board[j][i])){
                    if (map.containsKey(board[j][i])){
                        map.put(board[j][i] , map.get(board[j][i]) + 1);
                    }else {
                        map.put(board[j][i] , 1);
                    }
                    for(Map.Entry<Character,Integer> entry : map.entrySet()){
                        if(entry.getValue() > 1 ){
                            return false ;
                        }
                    sC = true ; 
                    }
                }else {continue;} 
            }
        }
        for (int i = 0 ; i <= length ; i+= 3){
            for (int j = 0 ; j <= length ; j+= 3){
                HashSet<Character> set = new HashSet<>();
                for (int k = 0 ; k < 3 ; k++){
                    for (int l = 0 ; l< 3 ; l++){
                        char c = board[i+k][j+l];
                        if (c == '.'){continue ;}
                        if (set.contains(c)){
                            return false ;
                        }
                        set.add(c);
                    tC = true ;

                }
               }
            }
        }


        if (sC == true && fC == true && tC == true){
            return true ;
        }else {return false ;}
    }
}