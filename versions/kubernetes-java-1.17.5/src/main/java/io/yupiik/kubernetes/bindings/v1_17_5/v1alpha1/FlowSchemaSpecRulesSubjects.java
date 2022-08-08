package io.yupiik.kubernetes.bindings.v1_17_5.v1alpha1;

import java.util.Objects;

public class FlowSchemaSpecRulesSubjects {
    private FlowSchemaSpecRulesSubjectsGroup group;
    private String kind;
    private FlowSchemaSpecRulesSubjectsServiceAccount serviceAccount;
    private FlowSchemaSpecRulesSubjectsUser user;

    public FlowSchemaSpecRulesSubjects() {
        // no-op
    }

    public FlowSchemaSpecRulesSubjects(final FlowSchemaSpecRulesSubjectsGroup group,
                                       final String kind,
                                       final FlowSchemaSpecRulesSubjectsServiceAccount serviceAccount,
                                       final FlowSchemaSpecRulesSubjectsUser user) {
        // no-op
    }

    public FlowSchemaSpecRulesSubjectsGroup getGroup() {
        return group;
    }

    public void setGroup(final FlowSchemaSpecRulesSubjectsGroup group) {
        this.group = group;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public FlowSchemaSpecRulesSubjectsServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(final FlowSchemaSpecRulesSubjectsServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    public FlowSchemaSpecRulesSubjectsUser getUser() {
        return user;
    }

    public void setUser(final FlowSchemaSpecRulesSubjectsUser user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                kind,
                serviceAccount,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlowSchemaSpecRulesSubjects)) {
            return false;
        }
        final FlowSchemaSpecRulesSubjects __otherCasted = (FlowSchemaSpecRulesSubjects) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(serviceAccount, __otherCasted.serviceAccount) &&
            Objects.equals(user, __otherCasted.user);
    }
}
