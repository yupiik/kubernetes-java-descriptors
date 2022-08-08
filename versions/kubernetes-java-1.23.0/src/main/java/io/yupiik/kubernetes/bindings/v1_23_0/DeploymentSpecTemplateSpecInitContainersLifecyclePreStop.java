package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.Objects;

public class DeploymentSpecTemplateSpecInitContainersLifecyclePreStop {
    private DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec exec;
    private DeploymentSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet;
    private DeploymentSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket;

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStop() {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStop(final DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec exec,
                                                                    final DeploymentSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet,
                                                                    final DeploymentSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
        // no-op
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec getExec() {
        return exec;
    }

    public void setExec(final DeploymentSpecTemplateSpecInitContainersLifecyclePreStopExec exec) {
        this.exec = exec;
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStopHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(final DeploymentSpecTemplateSpecInitContainersLifecyclePreStopHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public DeploymentSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(final DeploymentSpecTemplateSpecInitContainersLifecyclePreStopTcpSocket tcpSocket) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecInitContainersLifecyclePreStop)) {
            return false;
        }
        final DeploymentSpecTemplateSpecInitContainersLifecyclePreStop __otherCasted = (DeploymentSpecTemplateSpecInitContainersLifecyclePreStop) __other;
        return Objects.equals(exec, __otherCasted.exec) &&
            Objects.equals(httpGet, __otherCasted.httpGet) &&
            Objects.equals(tcpSocket, __otherCasted.tcpSocket);
    }
}
