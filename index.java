//キャンバス（描画エリアの取得）
const canvas = document.querySelector('#drawing-area');
//２dコンテキスト（描画ツールの取得）
const ctx = canvas.getContext('2d');
//消去ボタン
const clearBtn = document.querySelector('#clear-button');
//描画開始点　横の位置
let x;
//描画開始点 縦の位置
let y;
//マウスボタンが押されているかどうか(trueまたはfalse)
let mousePressed = false;
canvas.addEventListener('mousedown', startDrawing);
//描画を開始する
function startDrawing(e) {

  //-------------------------
  // マウスボタンが押されていることを示す
  // 押下された位置を取得する
  //-------------------------

}
//描画を開始する
function startDrawing(e) {

  //-------------------------
  // マウスボタンが押されていることを示す
  // 押下された位置を取得する
  //-------------------------

}
function startDrawing(e) {
  mousePressed = true;

  //押下された位置を取得する
  x = e.offsetX;
  y = e.offsetY;

}
canvas.addEventListener('mousemove', draw);
//線を描画する
function draw(e) {

  //-------------------------
  // マウスボタンを押していないときは描画しない
  /*** 描画する処理 ***/
  // 移動先の座標を取得する
  // 線を描画する
  // 開始点の座標を更新する
  //-------------------------

}
function draw(e) {

  //マウスボタンを押していないときは描画しない
  if (!mousePressed) return;

  //-------------------------
  /*** 描画する処理 ***/
  // 移動先の座標を取得する
  // 線を描画する
  // 開始点の座標を更新する
  //-------------------------

}
function draw(e) {
  if (!mousePressed) return;

  x2 = e.offsetX;
  y2 = e.offsetY;

  //線を描画する
  ctx.beginPath();    //描画開始
  ctx.moveTo(x, y);   //開始点
  ctx.lineTo(x2, y2); //移動先
  ctx.stroke();       //線を引く

  //-------------------------
  // 開始点の座標を更新する
  //-------------------------

}
function draw(e) {
  if (!mousePressed) return;

  x2 = e.offsetX;
  y2 = e.offsetY;

  ctx.beginPath();
  ctx.moveTo(x, y);
  ctx.lineTo(x2, y2);
  ctx.stroke();

  //開始点の座標を更新する
  x = x2;
  y = y2;

}
window.addEventListener('mouseup', () => mousePressed = false);
/* 関数を別で宣言するコード例 */
window.addEventListener('mouseup', stopDrawing);

function stopDrawing() {
  mousePressed = false;
}
//消去ボタンにclickイベントを追加
clearBtn.addEventListener('click', () => {
  ctx.clearRect(0, 0, canvas.width, canvas.height);
});
