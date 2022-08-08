package io.yupiik.kubernetes.bindings.v1_20_1.v1beta1;

import java.util.Objects;

public class PriorityLevelConfigurationSpecLimitedLimitResponse {
    private PriorityLevelConfigurationSpecLimitedLimitResponseQueuing queuing;
    private String type;

    public PriorityLevelConfigurationSpecLimitedLimitResponse() {
        // no-op
    }

    public PriorityLevelConfigurationSpecLimitedLimitResponse(final PriorityLevelConfigurationSpecLimitedLimitResponseQueuing queuing,
                                                              final String type) {
        // no-op
    }

    public PriorityLevelConfigurationSpecLimitedLimitResponseQueuing getQueuing() {
        return queuing;
    }

    public void setQueuing(final PriorityLevelConfigurationSpecLimitedLimitResponseQueuing queuing) {
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
        if (!(__other instanceof PriorityLevelConfigurationSpecLimitedLimitResponse)) {
            return false;
        }
        final PriorityLevelConfigurationSpecLimitedLimitResponse __otherCasted = (PriorityLevelConfigurationSpecLimitedLimitResponse) __other;
        return Objects.equals(queuing, __otherCasted.queuing) &&
            Objects.equals(type, __otherCasted.type);
    }
}
