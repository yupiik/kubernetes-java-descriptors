package io.yupiik.kubernetes.bindings.v1_31_3.v1;

import io.yupiik.kubernetes.bindings.v1_31_3.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_3.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class LinuxContainerUser implements Validable<LinuxContainerUser>, Exportable {
    private int gid;
    private List<Integer> supplementalGroups;
    private int uid;

    public LinuxContainerUser() {
        // no-op
    }

    public LinuxContainerUser(final int gid,
                              final List<Integer> supplementalGroups,
                              final int uid) {
        this.gid = gid;
        this.supplementalGroups = supplementalGroups;
        this.uid = uid;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(final int gid) {
        this.gid = gid;
    }

    public List<Integer> getSupplementalGroups() {
        return supplementalGroups;
    }

    public void setSupplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(final int uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                gid,
                supplementalGroups,
                uid);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof LinuxContainerUser)) {
            return false;
        }
        final LinuxContainerUser __otherCasted = (LinuxContainerUser) __other;
        return Objects.equals(gid, __otherCasted.gid) &&
            Objects.equals(supplementalGroups, __otherCasted.supplementalGroups) &&
            Objects.equals(uid, __otherCasted.uid);
    }

    public LinuxContainerUser gid(final int gid) {
        this.gid = gid;
        return this;
    }

    public LinuxContainerUser supplementalGroups(final List<Integer> supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
        return this;
    }

    public LinuxContainerUser uid(final int uid) {
        this.uid = uid;
        return this;
    }

    @Override
    public LinuxContainerUser validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    "\"gid\":" + gid,
                    (supplementalGroups != null ? "\"supplementalGroups\":" + supplementalGroups.stream().map(__it -> __it == null ? "null" : String.valueOf(__it)).collect(joining(",", "[", "]")) : ""),
                    "\"uid\":" + uid)
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
