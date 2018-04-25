/*
 *���ϸ�: Student.java
 *�ۼ���: 2018.4.24
 *�ۼ���: ������
 *����: �̸�, ����, ���� ������ ���� �л� Ŭ������ ����
 *���� ����� ���ǻ���: Student Ŭ���� �ܺο����� Student�� �̸�, ����, ���� ������ �̷���� ������ �˰� ������,
 *				  Address Ŭ������ ����� ���� ����
 */

package lab6_6;

public class Student {
	// (1) private inner class�� Address Ŭ���� ���� - �ʵ�� ����(city)�� ����(country), �޼ҵ�� ������(����, ������ �Ű������� ����)
	private class Address {
		String city;
		String country;
		public Address(String city, String country) {
			this.city = city;
			this.country = country;
		}
	}
	// (2) 2���� private �ʵ� ���� - �̸�(String Ÿ��), �ּ�(Address Ÿ��)
	private String name;
	private Address address = new Address("","");


	// (3) ������ ���� - name, city, country�� �Ű������� ����
	public Student(String name, String city, String country) {
		this.name = name;
		address.city = city;
		address.country = country;
	}

	// (4) �̸��� �����ϴ� �޼ҵ�
	public String getName() {
		return name;
	}

	// (5) ���ø� �����ϴ� �޼ҵ�
	public String getCity() {
		return address.city;
	}

	// (6) ������ �����ϴ� �޼ҵ�
	public String getCountry() {
		return address.country;
	}

	// (7) �Ű������� ���� ����, ������ �̻��ϴ� �޼ҵ�
	public void move(String city, String country) {
		address.city = city;
		address.country = country;
	}

	// (8) �̸�, ����, ������ ���ڿ��� �����ϴ� �޼ҵ�
	@Override
	public String toString() {
		return "�̸� = " + name + " ���� = " + address.city + " ���� = " + address.country;
	}
}