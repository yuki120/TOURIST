document.write("問1<br>");
function menseki(hankei,enshuritsu=3.14){
    return (hankei*hankei)*enshuritsu;
}
document.write(menseki(5) + "<br>");
document.write(menseki(7) + "<br>");
document.write(menseki(10) + "<br>");


document.write("<br><br>");
document.write("問2<br>");
function totalPrice(otona,kodomo,otonaPrice=500,kodomoPrice=200){
    return (otona*otonaPrice)+(kodomo*kodomoPrice);
}
document.write("Aグループの合計金額は" + totalPrice(2,4) + "円です。");
document.write("<br>");
document.write("Bグループの合計金額は" + totalPrice(1,5) + "円です。");
document.write("<br>");
document.write("Cグループの合計金額は" + totalPrice(3,7) + "円です。");
document.write("<br>");