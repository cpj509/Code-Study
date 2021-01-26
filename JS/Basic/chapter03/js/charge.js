var age = parseInt(prompt("나이를 입력하세요."));
        var charge = 0; //입장료

        if(age < 8){
            document.write("미취학 아동 입니다.<br>");
            charge = 1000;
        }else if(age >= 8 && age < 14){
            document.write("초등학생 입니다.<br>");
            charge = 2000;
        }else if(age >= 8 && age < 14){
            document.write("중, 고등학생 입니다.<br>");
            charge = 2500;
        }else{
            document.write("성인 입니다.<br>");
            charge = 3000;
        }
        document.write("입장료는 <span class='accent'> " + charge + "</span>원 입니다.")