package io.yupiik.kubernetes.bindings.bundlebee.v1;

import io.yupiik.kubernetes.bindings.bundlebee.Exportable;
import io.yupiik.kubernetes.bindings.bundlebee.JsonStrings;
import io.yupiik.kubernetes.bindings.bundlebee.Validable;
import io.yupiik.kubernetes.bindings.bundlebee.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class Requirement implements Validable<Requirement>, Exportable {
    private List<String> forbiddenVersions;
    private String maxBundlebeeVersion;
    private String minBundlebeeVersion;

    public Requirement() {
        // no-op
    }

    public Requirement(final List<String> forbiddenVersions,
                       final String maxBundlebeeVersion,
                       final String minBundlebeeVersion) {
        // no-op
    }

    public List<String> getForbiddenVersions() {
        return forbiddenVersions;
    }

    public void setForbiddenVersions(final List<String> forbiddenVersions) {
        this.forbiddenVersions = forbiddenVersions;
    }

    public String getMaxBundlebeeVersion() {
        return maxBundlebeeVersion;
    }

    public void setMaxBundlebeeVersion(final String maxBundlebeeVersion) {
        this.maxBundlebeeVersion = maxBundlebeeVersion;
    }

    public String getMinBundlebeeVersion() {
        return minBundlebeeVersion;
    }

    public void setMinBundlebeeVersion(final String minBundlebeeVersion) {
        this.minBundlebeeVersion = minBundlebeeVersion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                forbiddenVersions,
                maxBundlebeeVersion,
                minBundlebeeVersion);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Requirement)) {
            return false;
        }
        final Requirement __otherCasted = (Requirement) __other;
        return Objects.equals(forbiddenVersions, __otherCasted.forbiddenVersions) &&
            Objects.equals(maxBundlebeeVersion, __otherCasted.maxBundlebeeVersion) &&
            Objects.equals(minBundlebeeVersion, __otherCasted.minBundlebeeVersion);
    }

    public Requirement forbiddenVersions(final List<String> forbiddenVersions) {
        this.forbiddenVersions = forbiddenVersions;
        return this;
    }

    public Requirement maxBundlebeeVersion(final String maxBundlebeeVersion) {
        this.maxBundlebeeVersion = maxBundlebeeVersion;
        return this;
    }

    public Requirement minBundlebeeVersion(final String minBundlebeeVersion) {
        this.minBundlebeeVersion = minBundlebeeVersion;
        return this;
    }

    @Override
    public Requirement validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (forbiddenVersions != null ? "\"forbiddenVersions\":" + forbiddenVersions.stream().map(__it -> __it == null ? "null" : ("\"" + JsonStrings.escapeJson(__it) + "\"")).collect(joining(",", "[", "]")) : ""),
                    (maxBundlebeeVersion != null ? "\"maxBundlebeeVersion\":\"" +  JsonStrings.escapeJson(maxBundlebeeVersion) + "\"" : ""),
                    (minBundlebeeVersion != null ? "\"minBundlebeeVersion\":\"" +  JsonStrings.escapeJson(minBundlebeeVersion) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
