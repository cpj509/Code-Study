var session = prompt("관심 세션을 선택 해 주세요.", "1-마케팅, 2-개발, 3-디자인");

switch(session){
    case "1":
        document.write("마케팅 세션은 201호 입니다.");
        break;
    case "2":
        document.write("개발 세션은 202호 입니다.");
        break;
    case "3":
        document.write("디자인 세션은 203호 입니다.");
        break;
    default:
        document.write("숫자 1 ~ 3 중에 입력 해 주세요.");
}