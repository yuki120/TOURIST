document.write("問1<br>");
for(a = 1; a <= 5; a++){
    for(b = 1; b <= 5; b++){
        document.write("★");
    }
    document.write("<br>");
}


document.write("<br><br>");
document.write("問2<br>");
for(a = 1; a <= 5; a++){
    for(b = 1; b <= 5; b++){
        if(a % 2 == 0　&& b % 2 == 0){
            document.write("★");
        }else if(a % 2 == 0　&& b % 2 == 1){
            document.write("☆");
        }else if(a % 2 == 1　&& b % 2 == 0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}


document.write("<br><br>");
document.write("問3<br>");
for(a = 0; a < 5; a++){
    for(b = 0; b < 5; b++){
        if(a == b){
            document.write("☆");
        }else{
        document.write("★");
        }
    }    
    document.write("<br>");
}


document.write("<br><br>");
document.write("問4<br>");
for(a = 0; a < 5; a++){
    for(b = 0; b < a+1; b++){
        document.write("★");
    }
    document.write("<br>");
}


document.write("<br><br>");
document.write("問5<br>");
for(a = 0; a < 5; a++){
    for(b = 0; b <= a; b++){
        if(a == b){
            document.write("☆");
        }else{
            document.write("★");
        }
    }    
    document.write("<br>");
}






