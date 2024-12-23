let memberTable = [];

signUp = () => {
  let signid = document.querySelector(".signid");
  let signpw = document.querySelector(".signpw");
  let signnick = document.querySelector(".signnick");

  let id = signid.value;
  let pw = signpw.value;
  let nick = signnick.value;

  let memberDto = { id: id, pw: pw, nickname: nick };
  console.log(memberDto);
  memberTable.push(memberDto);
};
