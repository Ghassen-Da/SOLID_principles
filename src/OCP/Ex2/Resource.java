package OCP.Ex2;

public interface Resource {
	
	public void markSlotFree(int resourceId);
	
    public void markSlotBusy(int resourceId);

    public int findFreeSlot();

}
