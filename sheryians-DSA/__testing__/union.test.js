const Solution = require("../main/union");

describe('checking union class fun', () => {
    test('should be union format', () => {
        let sol=new Solution()

        expect(sol.findUnion([111,2,3],[111,2,3])).toEqual([ 2, 3, 111])
    })
    
});
