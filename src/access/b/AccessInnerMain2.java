package access.b;

import access.a.AccessData;

public class AccessInnerMain2 {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //data.defaultField = 1;
        //data.defaultMethod();

        data.publicField = 2;
        data.publicMethod();

        // 호출블가
        //data.privateField =3;
        //data.privateMethod();

        data.innerAccess();
    }
}
