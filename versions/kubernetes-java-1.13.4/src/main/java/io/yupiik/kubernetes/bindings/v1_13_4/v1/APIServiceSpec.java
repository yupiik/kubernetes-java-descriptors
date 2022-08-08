package io.yupiik.kubernetes.bindings.v1_13_4.v1;

import java.util.Objects;

public class APIServiceSpec {
    private String caBundle;
    private String group;
    private int groupPriorityMinimum;
    private Boolean insecureSkipTLSVerify;
    private APIServiceSpecService service;
    private String version;
    private int versionPriority;

    public APIServiceSpec() {
        // no-op
    }

    public APIServiceSpec(final String caBundle,
                          final String group,
                          final int groupPriorityMinimum,
                          final Boolean insecureSkipTLSVerify,
                          final APIServiceSpecService service,
                          final String version,
                          final int versionPriority) {
        // no-op
    }

    public String getCaBundle() {
        return caBundle;
    }

    public void setCaBundle(final String caBundle) {
        this.caBundle = caBundle;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public int getGroupPriorityMinimum() {
        return groupPriorityMinimum;
    }

    public void setGroupPriorityMinimum(final int groupPriorityMinimum) {
        this.groupPriorityMinimum = groupPriorityMinimum;
    }

    public Boolean getInsecureSkipTLSVerify() {
        return insecureSkipTLSVerify;
    }

    public void setInsecureSkipTLSVerify(final Boolean insecureSkipTLSVerify) {
        this.insecureSkipTLSVerify = insecureSkipTLSVerify;
    }

    public APIServiceSpecService getService() {
        return service;
    }

    public void setService(final APIServiceSpecService service) {
        this.service = service;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    public int getVersionPriority() {
        return versionPriority;
    }

    public void setVersionPriority(final int versionPriority) {
        this.versionPriority = versionPriority;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                caBundle,
                group,
                groupPriorityMinimum,
                insecureSkipTLSVerify,
                service,
                version,
                versionPriority);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIServiceSpec)) {
            return false;
        }
        final APIServiceSpec __otherCasted = (APIServiceSpec) __other;
        return Objects.equals(caBundle, __otherCasted.caBundle) &&
            Objects.equals(group, __otherCasted.group) &&
            Objects.equals(groupPriorityMinimum, __otherCasted.groupPriorityMinimum) &&
            Objects.equals(insecureSkipTLSVerify, __otherCasted.insecureSkipTLSVerify) &&
            Objects.equals(service, __otherCasted.service) &&
            Objects.equals(version, __otherCasted.version) &&
            Objects.equals(versionPriority, __otherCasted.versionPriority);
    }
}
