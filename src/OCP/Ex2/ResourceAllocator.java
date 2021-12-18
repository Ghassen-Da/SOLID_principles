package OCP.Ex2;

public class ResourceAllocator
{
    private Resource _resource;
    
    
    public  ResourceAllocator(Resource resource) {
    	_resource = resource;
    	
    }

    public int allocate()
    {
        int resourceId = _resource.findFreeSlot();
        _resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId)
    {
       _resource.markSlotFree(resourceId);
    }

    
}
