package org.studyeasy.shop;

public class Door {
	private Lock lock;
	
	public Door() {
	lock = new Lock(true, "Green");
	}
	
	public Lock getLock() {
		return lock;
	}

	
	public void shopStatus() {
		if(lock.isLock()) {
			System.out.println("Shop is closed, please visit later");
		} else {
			System.out.println("Welcome, we are open!");
		}
	}
	
	public class Lock {
		private String handle;
		private boolean lock;

		public Lock(boolean lock, String handle) {
			this.lock = lock;
			this.handle = handle;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

		public String getHandle() {
			return handle;
		}

		public void setHandle(String handle) {
			this.handle = handle;
		}
		
		public void theHandle() {
			System.out.println("The handle color is: " + handle);
		}
		
		
	}
}
