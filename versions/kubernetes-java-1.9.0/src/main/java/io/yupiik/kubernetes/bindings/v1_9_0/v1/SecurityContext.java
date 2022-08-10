package io.yupiik.kubernetes.bindings.v1_9_0.v1;

import io.yupiik.kubernetes.bindings.v1_9_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_0.Validable;
import io.yupiik.kubernetes.bindings.v1_9_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class SecurityContext implements Validable<SecurityContext>, Exportable {
    private Boolean allowPrivilegeEscalation;
    private Capabilities capabilities;
    private Boolean privileged;
    private Boolean readOnlyRootFilesystem;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private SELinuxOptions seLinuxOptions;

    public SecurityContext() {
        // no-op
    }

    public SecurityContext(final Boolean allowPrivilegeEscalation,
                           final Capabilities capabilities,
                           final Boolean privileged,
                           final Boolean readOnlyRootFilesystem,
                           final Boolean runAsNonRoot,
                           final Integer runAsUser,
                           final SELinuxOptions seLinuxOptions) {
        // no-op
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(final Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(final Boolean privileged) {
        this.privileged = privileged;
    }

    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(final Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    public void setRunAsNonRoot(final Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    public Integer getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(final Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                allowPrivilegeEscalation,
                capabilities,
                privileged,
                readOnlyRootFilesystem,
                runAsNonRoot,
                runAsUser,
                seLinuxOptions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecurityContext)) {
            return false;
        }
        final SecurityContext __otherCasted = (SecurityContext) __other;
        return Objects.equals(allowPrivilegeEscalation, __otherCasted.allowPrivilegeEscalation) &&
            Objects.equals(capabilities, __otherCasted.capabilities) &&
            Objects.equals(privileged, __otherCasted.privileged) &&
            Objects.equals(readOnlyRootFilesystem, __otherCasted.readOnlyRootFilesystem) &&
            Objects.equals(runAsNonRoot, __otherCasted.runAsNonRoot) &&
            Objects.equals(runAsUser, __otherCasted.runAsUser) &&
            Objects.equals(seLinuxOptions, __otherCasted.seLinuxOptions);
    }

    public SecurityContext allowPrivilegeEscalation(final Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        return this;
    }

    public SecurityContext capabilities(final Capabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public SecurityContext privileged(final Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    public SecurityContext readOnlyRootFilesystem(final Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        return this;
    }

    public SecurityContext runAsNonRoot(final Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
        return this;
    }

    public SecurityContext runAsUser(final Integer runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    public SecurityContext seLinuxOptions(final SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
        return this;
    }

    @Override
    public SecurityContext validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (allowPrivilegeEscalation != null ? "\"allowPrivilegeEscalation\":" + allowPrivilegeEscalation : ""),
                    (capabilities != null ? "\"capabilities\":" + capabilities.asJson() : ""),
                    (privileged != null ? "\"privileged\":" + privileged : ""),
                    (readOnlyRootFilesystem != null ? "\"readOnlyRootFilesystem\":" + readOnlyRootFilesystem : ""),
                    (runAsNonRoot != null ? "\"runAsNonRoot\":" + runAsNonRoot : ""),
                    (runAsUser != null ? "\"runAsUser\":" + runAsUser : ""),
                    (seLinuxOptions != null ? "\"seLinuxOptions\":" + seLinuxOptions.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}