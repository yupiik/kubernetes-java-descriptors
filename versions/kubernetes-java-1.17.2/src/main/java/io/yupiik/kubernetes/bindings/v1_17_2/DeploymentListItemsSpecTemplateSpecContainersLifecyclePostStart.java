package io.yupiik.kubernetes.bindings.v1_17_2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart {
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec;
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet;
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket;

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec,
                                                                           final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet,
                                                                           final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartExec exec) {
        this.exec = exec;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStartTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                exec,
                httpGet,
                tcpSocket);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLifecyclePostStart) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
