class Solution{
    static ArrayList<Integer> getTable(int N){
        
        ArrayList<Integer> table = new ArrayList();
        
        for(int i = 1 ; i<= 10; i++){
            table.add(N*i);
        }
        return table;
    }
}

ArrayList<Integer> table = new ArrayList();
This line initializes an ArrayList named table to store the elements of the multiplication table.

for(int i = 1 ; i<= 10; i++)
 This line starts a loop that runs from 1 to 10, inclusive. This loop iterates over each number from 1 to 10.

table.add(N*i): 
Inside the loop, this line calculates the product of N and the current loop variable i, which represents the multiplier.
It then adds this product to the ArrayList table.

After the loop finishes, the function returns the ArrayList table containing the multiplication table of N.

For example, if N is 5, 
the function will return an ArrayList containing the elements [5, 10, 15, 20, 25, 30, 35, 40, 45, 50], 
which represent the multiplication table of 5 up to 10.






