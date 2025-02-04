const fs = require("fs");
const input = fs.readFileSync("/dev/stdin").toString().trim();
let [N, M] = input.split("\n")[0].split(" ").map(Number);
let board = [];
for (let i = 1; i <= N; i++) {
  let row = input.split("\n")[i].split("");
  board.push(row);
}
function solution(N, M, board) {
  let mincnt = 64;
  function getRepaintCountW(board, n, m) {
    let repaintCount = 0;
    let color = "W";
    for (let i = 0; i < 8; i++) {
      for (let j = 0; j < 8; j++) {
        if (board[n + i][m + j] != color) {
          repaintCount++;
        }
        color = color == "W" ? "B" : "W";
      }
      color = color == "W" ? "B" : "W";
    }
    return repaintCount;
  }
  function getRepaintCountB(board, n, m) {
    let repaintCount = 0;
    let color = "B";
    for (let i = 0; i < 8; i++) {
      for (let j = 0; j < 8; j++) {
        if (board[n + i][m + j] != color) {
          repaintCount++;
        }
        color = color == "W" ? "B" : "W";
      }
      color = color == "W" ? "B" : "W";
    }
    return repaintCount;
  }

  for (let i = 0; i <= N - 8; i++) {
    for (let j = 0; j <= M - 8; j++) {
      let repaintW = getRepaintCountW(board, i, j);
      let repaintB = getRepaintCountB(board, i, j);
      mincnt = Math.min(mincnt, repaintW, repaintB);
    }
  }
  return mincnt; // 이 부분을 for 루프 밖으로 이동
}
console.log(solution(N, M, board));
