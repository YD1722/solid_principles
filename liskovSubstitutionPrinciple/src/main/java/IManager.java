public abstract class IManager extends IEmployee implements IExecutive, IManaged {
    IEmployee reportManager;

    public void assignManager(IEmployee manager) {
        this.reportManager = manager;
    }
}
