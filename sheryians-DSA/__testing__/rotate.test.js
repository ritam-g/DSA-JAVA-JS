const Solution = require("../main/rotate");

describe('rotate clock wise testing', () => {
        test('rotate by 2', () => {
          const sol =new Solution()
          expect(sol.rotateclockwise([1,2,3,4,5], 2)).toEqual([4,5,1,2,3])
        })
        
});
