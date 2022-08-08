package io.yupiik.kubernetes.bindings.v1_20_11.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop {
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec;
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet;
    private DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket;

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec,
                                                                         final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet,
                                                                         final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop __otherCasted = (DeploymentListItemsSpecTemplateSpecContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
