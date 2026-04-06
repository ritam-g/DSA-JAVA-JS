///////////////////////////////
// BFS Traversal - JS Boilerplate
///////////////////////////////

/**
 * Example: Graph represented as an adjacency list
 * adj[node] = [list of connected nodes]
 * 
 * Example:
 * const adj = [
 *   [1, 2],    // Node 0 connects to 1 and 2
 *   [0, 3, 4], // Node 1 connects to 0, 3, 4
 *   [0, 4],    // Node 2 connects to 0, 4
 *   [1],       // Node 3 connects to 1
 *   [1, 2]     // Node 4 connects to 1, 2
 * ];
 */

class Solution {
    constructor() {
        // Optional: store BFS traversal result
        this.result = [];
    }

    /**
     * Perform BFS on a graph using adjacency list
     * @param {number[][]} adj - adjacency list
     * @returns {number[]} - BFS traversal order
     */
    bfs(adj) {
        // 1️⃣ Number of nodes
        const n= adj.length;

        // 2️⃣ Visited array to track visited nodes
        const visitied = new Array(n).fill(false);

        // 3️⃣ Initialize queue for BFS
        //      - Can use Array: push() → back, shift() → front
        //      - Or implement Deque for faster operations
        const queue = [];

        // 4️⃣ Optional: store BFS traversal
    

        // 5️⃣ Start BFS from node 0
        // TODO: push starting node into queue
        queue.push(0);
        // TODO: mark node as visited
        visitied[0] = true;

        // 6️⃣ BFS loop
        // while queue is not empty:
        //   a) pop front node
        //   b) add node to result
        //   c) iterate all neighbors:
        //        - if neighbor not visited:
        //            - mark as visited
        //            - push to back of queue

        while(queue.length>0){
            let node=queue.shift();
            this.result.push(node);
            console.log(node);
            
            
            for(const near of adj[node]){
                // here nea will take the value of adj like //! 0:[1,2] he is not going to take 0 as a value
                if(!visitied[near]){
                    visitied[near]=true;
                    queue.push(near);
                }
            }
        }

        // 7️⃣ Return BFS result
        return this.result;
    }
}

// -------------------------------
// Example Usage
// -------------------------------
const adj = [
    [1, 2],
    [0, 3, 4],
    [0, 4],
    [1],
    [1, 2]
];

const sol = new Solution();
const bfsTraversal = sol.bfs(adj); // Fill TODOs inside bfs method
console.log("BFS Traversal:", bfsTraversal);