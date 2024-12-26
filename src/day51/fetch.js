// fetch("https://jsonplaceholder.typicode.com/posts")
//   .then((response) => response.json()) // 요청 결과를 JSON 형식으로 변환
//   .then((data) => console.log(data)) // 요청 결과 후 실행할 코드 작성
//   .catch((error) => {
//     console.log(error);
//   });

// // 3 POST(create) 요청
// const board = { title: "새로운제목", body: "새로운내용", userId: 1 };
// const option1 = {
//   method: "POST",
//   headers: { "Content-Type": "application/json" },
//   body: JSON.stringify(board),
// };
// // fetch 함수의 전송 옵션
// // http메소드 선택(GET/POST/PUT/DELETE)
// // 보낼 자료의 형식 설정 application/json
// // 보낼 자료
// fetch("https://jsonplaceholder.typicode.com/posts", option1)
//   .then((response) => response.json())
//   .then((data) => console.log(data));

// // 4 PUT(update) 요청
// const boardUpdate = {
//   id: 1,
//   title: "수정할제목",
//   body: "수정할내용",
//   userId: 1,
// };
// const option2 = {
//   method: "PUT",
//   headers: { "Content-Type": "application/json" },
//   body: JSON.stringify(boardUpdate),
// };
// fetch("https://jsonplaceholder.typicode.com/posts/1", option2)
//   .then((response) => response.json())
//   .then((data) => console.log(data));

// // 5 DELETE 요청
// const option3 = {
//   method: "DELETE",
// };
// fetch("https://jsonplaceholder.typicode.com/posts/1", option3)
//   .then((response) => response.json())
//   .then((data) => console.log(data));

//실습
// 1
fetch("https://reqres.in/api/users/2", { method: "GET" })
  .then((response) => response.json())
  .then((data) => console.log(data));

// 2
const userData1 = { name: "morpheus", job: "leader" };
const userOption_post = {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(userData1),
};
fetch("https://reqres.in/api/users/2", userOption_post)
  .then((response) => response.json())
  .then((data) => console.log(data));

// 3
const userData2 = { name: "morpheus", job: "zion resident" };
const userOption_put = {
  method: "PUT",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(userData2),
};
fetch("https://reqres.in/api/users/2", userOption_put)
  .then((response) => response.json())
  .then((data) => console.log(data));

// 3_1
fetch("https://reqres.in/api/users/2", {
  method: "PUT",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(userData2),
})
  .then((response) => response.json())
  .then((data) => console.log(data));

// 4
fetch("https://reqres.in/api/users/2", { method: "DELETE" });
