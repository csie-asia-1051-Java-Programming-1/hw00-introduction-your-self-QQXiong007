import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s1 = new Student("�p��","105021001");
        Student s2 = new Student("�p��","105021002");
        Student s3 = new Student("�p��","105021003");
        Student s4 = new Student("�p��","105021004");
        Student s5 = new Student("�p��","105021005");
        s1.setGender("�k");
        s2.setGender("�k");
        s3.setGender("�k");
        s4.setGender("�k");
        s5.setGender("�k");
        s1.setTel("0800111000");
        s2.setTel("0800111001");
        s3.setTel("0800111002");
        s4.setTel("0800111003");
        s5.setTel("0800111004");
        s1.setHeight(175);
        s2.setHeight(160);
        s3.setHeight(180);
        s4.setHeight(185);
        s5.setHeight(150);
        s1.setWeight(55);
        s2.setWeight(45);
        s3.setWeight(70);
        s4.setWeight(60);
        s5.setWeight(48);
        System.out.println("�m�W:"+s1.getName()+"  �Ǹ�:"+s1.getId()+"  �ʧO:"+s1.getGender()+"  �q��:"+s1.getTel()+"  ����:"+s1.getHeight()+"  �魫:"+s1.getWeight());
        System.out.println("�m�W:"+s2.getName()+"  �Ǹ�:"+s2.getId()+"  �ʧO:"+s2.getGender()+"  �q��:"+s2.getTel()+"  ����:"+s2.getHeight()+"  �魫:"+s2.getWeight());
        System.out.println("�m�W:"+s3.getName()+"  �Ǹ�:"+s3.getId()+"  �ʧO:"+s3.getGender()+"  �q��:"+s3.getTel()+"  ����:"+s3.getHeight()+"  �魫:"+s3.getWeight());
        System.out.println("�m�W:"+s4.getName()+"  �Ǹ�:"+s4.getId()+"  �ʧO:"+s4.getGender()+"  �q��:"+s4.getTel()+"  ����:"+s4.getHeight()+"  �魫:"+s4.getWeight());
        System.out.println("�m�W:"+s5.getName()+"  �Ǹ�:"+s5.getId()+"  �ʧO:"+s5.getGender()+"  �q��:"+s5.getTel()+"  ����:"+s5.getHeight()+"  �魫:"+s5.getWeight());
	}

}
