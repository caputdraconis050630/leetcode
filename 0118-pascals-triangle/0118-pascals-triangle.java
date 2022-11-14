class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        ret.add(firstRow);
        if (numRows == 1) {
            return ret;
        }
        for (int i=1; i<numRows; i++) {
            List<Integer> oneRow = new ArrayList<>();
            oneRow.add(1);
            
            for (int j=1; j<i; j++) {
                oneRow.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
            }
            
            oneRow.add(1);
            ret.add(oneRow);
        }
        
        return ret;
    }
}