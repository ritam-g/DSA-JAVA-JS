// Seminar Hall Booking

// A college has only one seminar hall. Multiple student clubs want to book the hall for their events.

// You are given an array of intervals where each interval represents the start and end time of an event.

// Determine whether all events can be accommodated in the seminar hall without any scheduling conflict.

// Return true if no events overlap, otherwise return false.
// [[1,3], [4,6], [7,8]]

const times = [
    [1, 3], //0
    [3, 6],//1
    [7, 8]//2
]

function DeterMineTime(times) {
    times.sort((a, b) => a[0] - b[0]);
    for (let i = 0; i < times.length - 1; i++) {
        const before = times[i]

        if (before[1] >= times[i + 1][0] || before[1] >= times[i + 1][1]) {
            return false
        }
    }

    return true
}
console.log(DeterMineTime(times))
