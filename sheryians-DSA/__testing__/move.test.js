const Move = require("../main/move_zeroes");

describe('testing 0 at the end', () => {

    test('should move 0 to the last', () => {

        const m = new Move()

        expect(
            m.moveZeroes([1,2,3,4,0,5])
        ).toEqual([1,2,3,4,5,0])

    })

});