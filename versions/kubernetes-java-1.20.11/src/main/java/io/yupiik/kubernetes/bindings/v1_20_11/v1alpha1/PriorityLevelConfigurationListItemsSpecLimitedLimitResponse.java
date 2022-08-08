package io.yupiik.kubernetes.bindings.v1_20_11.v1alpha1;

import java.util.Objects;

public class PriorityLevelConfigurationListItemsSpecLimitedLimitResponse {
    private PriorityLevelConfigurationListItemsSpecLimitedLimitResponseQueuing queuing;
    private String type;

    public PriorityLevelConfigurationListItemsSpecLimitedLimitResponse() {
        // no-op
    }

    public PriorityLevelConfigurationListItemsSpecLimitedLimitResponse(final PriorityLevelConfigurationListItemsSpecLimitedLimitResponseQueuing queuing,
                                                                       final String type) {
        // no-op
    }

    public PriorityLevelConfigurationListItemsSpecLimitedLimitResponseQueuing getQueuing() {
        return queuing;
    }

    public void setQueuing(final PriorityLevelConfigurationListItemsSpecLimitedLimitResponseQueuing queuing) {
        this.queuing = queuing;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                queuing,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PriorityLevelConfigurationListItemsSpecLimitedLimitResponse)) {
            return false;
        }
        final PriorityLevelConfigurationListItemsSpecLimitedLimitResponse __otherCasted = (PriorityLevelConfigurationListItemsSpecLimitedLimitResponse) __other;
        return Objects.equals(queuing, __otherCasted.queuing) &&
            Objects.equals(type, __otherCasted.type);
    }
}
