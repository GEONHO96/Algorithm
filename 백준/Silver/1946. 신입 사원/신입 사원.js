const fs = require("fs");
const input = fs.readFileSync("dev/stdin").toString().trim().split("\n");

const T = Number(input[0]);
let index = 1;
for (let i = 0; i < T; i++) {
  const N = Number(input[index++]);
  const rank = [];
  for (let j = 0; j < N; j++) {
    const [doc, interview] = input[index++].split(' ').map(Number);
    rank.push({doc, interview});
  }
  console.log(solution(rank, N))
}

function solution(arr, N) {
  arr.sort((a,b) => a.doc - b.doc)
  let count = 1
  let minarr = arr[0].interview
  for (let i = 1; i < N; i++) {
    if (arr[i].interview < minarr) {
        count++;
        minarr = arr[i].interview
      }
  }
  return count
}
