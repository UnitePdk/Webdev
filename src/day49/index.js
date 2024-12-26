let memberTable = [];

signUp = () => {
  let signid = document.querySelector(".signid");
  let signpw = document.querySelector(".signpw");
  let signnick = document.querySelector(".signnick");

  let id_ = signid.value;
  let pw_ = signpw.value;
  let nick_ = signnick.value;

  // 아이디 중복 검사
  const duple = memberTable.some((v) => {
    if (v.id == id_) {
      alert("이미 존재하는 아이디입니다");
      return true;
    }
  });
  if (duple) return;

  // 비밀번호 글자수 검사
  if (pw_.length < 5 || pw_.length > 10) {
    alert("비밀번호는 최소 5~10 글자 이내 입니다.");
    return;
  }

  // 닉네임 존재 검사
  if (nick_ == "") {
    alert("닉네임을 입력해주세요");
    return;
  }

  let memberDto = { id: id_, pw: pw_, nickname: nick_ };
  console.log(memberDto);
  memberTable.push(memberDto);

  alert("회원가입 성공");
  signid.value = "";
  signpw.value = "";
  signnick.value = "";

  printList();
};

const login = () => {
  let loginid = document.querySelector(".loginid").value;
  let loginpw = document.querySelector(".loginpw").value;
  let loginnick;

  // 아이디 판정
  const idCheck = memberTable.some((v) => {
    loginnick = v.nickname;
    return loginid == v.id;
  });

  // 비밀번호 판정
  const pwCheck = memberTable.some((v) => {
    return loginpw == v.pw;
  });

  if (idCheck && pwCheck) {
    alert(`${loginnick}님 환영합니다`);

    // 상단에 닉네임 표시
    const member = document.querySelector(".member");
    member.innerHTML = loginnick;
  } else if (!idCheck) {
    alert("존재하지 않는 아이디입니다");
  } else if (!pwCheck) {
    alert("비밀번호가 일치하지 않습니다");
  }
};

const printList = () => {
  memberListBox = document.querySelector(".memberListBox");
  let result = "<h3>회원명단</h3>";
  memberTable.map((v) => {
    result += `<div>${v.nickname}</div>`;
  });
  memberListBox.innerHTML = result;
};
