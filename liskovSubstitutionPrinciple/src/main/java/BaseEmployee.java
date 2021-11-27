public abstract class BaseEmployee extends IEmployee implements IManaged {
    IEmployee reportingManager;

    @Override
    public void assignManager(IEmployee manager) {
        this.reportingManager = manager;
    }
}
