package anoud;


	class area {
		area() {
			System.out.println("Inside A's constructor.");
		}
	}

	class circle extends area {
		circle(){
			System.out.println("Inside B's constructor.");
		}
	}

	class C extends circle {
		C() {
			System.out.println("Inside C's constructor.");
		}
	}

	class SuperClassDemo {
		public static void main(String args[]) {
			C c = new C();
		}
	}

