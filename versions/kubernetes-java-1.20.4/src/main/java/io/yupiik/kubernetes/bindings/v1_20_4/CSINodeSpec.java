package io.yupiik.kubernetes.bindings.v1_20_4;

import java.util.List;
import java.util.Objects;

public class CSINodeSpec {
    private List<CSINodeSpecDrivers> drivers;

    public CSINodeSpec() {
        // no-op
    }

    public CSINodeSpec(final List<CSINodeSpecDrivers> drivers) {
        // no-op
    }

    public List<CSINodeSpecDrivers> getDrivers() {
        return drivers;
    }

    public void setDrivers(final List<CSINodeSpecDrivers> drivers) {
        this.drivers = drivers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                drivers);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSINodeSpec)) {
            return false;
        }
        final CSINodeSpec __otherCasted = (CSINodeSpec) __other;
        return Objects.equals(drivers, __otherCasted.drivers);
    }
}
