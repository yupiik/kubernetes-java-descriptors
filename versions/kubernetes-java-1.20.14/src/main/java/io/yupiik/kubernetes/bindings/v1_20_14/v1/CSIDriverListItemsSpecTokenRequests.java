package io.yupiik.kubernetes.bindings.v1_20_14.v1;

import java.util.Objects;

public class CSIDriverListItemsSpecTokenRequests {
    private String audience;
    private Integer expirationSeconds;

    public CSIDriverListItemsSpecTokenRequests() {
        // no-op
    }

    public CSIDriverListItemsSpecTokenRequests(final String audience,
                                               final Integer expirationSeconds) {
        // no-op
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(final String audience) {
        this.audience = audience;
    }

    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audience,
                expirationSeconds);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriverListItemsSpecTokenRequests)) {
            return false;
        }
        final CSIDriverListItemsSpecTokenRequests __otherCasted = (CSIDriverListItemsSpecTokenRequests) __other;
        return Objects.equals(audience, __otherCasted.audience) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds);
    }
}
