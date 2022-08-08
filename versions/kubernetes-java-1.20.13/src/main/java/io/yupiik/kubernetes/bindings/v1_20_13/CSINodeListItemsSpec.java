package io.yupiik.kubernetes.bindings.v1_20_13;

import java.util.List;
import java.util.Objects;

public class CSINodeListItemsSpec {
    private List<CSINodeListItemsSpecDrivers> drivers;

    public CSINodeListItemsSpec() {
        // no-op
    }

    public CSINodeListItemsSpec(final List<CSINodeListItemsSpecDrivers> drivers) {
        // no-op
    }

    public List<CSINodeListItemsSpecDrivers> getDrivers() {
        return drivers;
    }

    public void setDrivers(final List<CSINodeListItemsSpecDrivers> drivers) {
        this.drivers = drivers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                drivers);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeListItemsSpec)) {
            return false;
        }
        final CSINodeListItemsSpec __otherCasted = (CSINodeListItemsSpec) __other;
        return Objects.equals(drivers, __otherCasted.drivers);
    }
}
