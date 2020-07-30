1×1=1
2×1=2,2×2=4
3×1=3,3×2=6,3×3=9
......
9×1=9,9×2=18,9×3=27,… 9×9=81

public void chengfabiao(){
for(int i = 1;i <= 9;i++){
for(int j = 1;j <= i;j++){
System.out.print(i + "*" + j + "=" + i*j);
if(i != j){
System.out.prin(",");
}
else{
System.out.println("");
}
}
}
}
