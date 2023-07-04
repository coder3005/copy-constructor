/* Copy Constructor */
class W 
{
    int a; String b;
    W()
    {
        a=10; b="abhi";
        System.out.println(a+" "+b);
    }
    W(W ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}
class S
{
    public static void main(String[] args) {
        W r=new W();
        W r2=new W(r);
    }
}