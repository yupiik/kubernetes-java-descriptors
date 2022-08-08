package io.yupiik.kubernetes.bindings.v1_15_0;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken {
    private String audience;
    private Integer expirationSeconds;
    private String path;

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken(final String audience,
                                                                                final Integer expirationSeconds,
                                                                                final String path) {
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

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audience,
                expirationSeconds,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken __otherCasted = (ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken) __other;
        return Objects.equals(audience, __otherCasted.audience) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds) &&
            Objects.equals(path, __otherCasted.path);
    }
}
