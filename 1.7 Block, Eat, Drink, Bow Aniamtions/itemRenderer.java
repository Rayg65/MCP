                    switch (enumaction)
                    {
                        case NONE:
                            this.transformFirstPersonItem(f, 0.0F);
                            break;
                        case EAT:
                        case DRINK:
                            this.func_178104_a(entityplayersp, partialTicks);
                            this.transformFirstPersonItem(f, f1);
                            break;
                        case BLOCK:
                            this.transformFirstPersonItem(0.2F, f1);
                            this.func_178103_d();
                            GlStateManager.translate(-0.5F, 0.2F, 0.0F);
                            break;
                        case BOW:
                            this.transformFirstPersonItem(f, f1);
                            this.func_178098_a(partialTicks, entityplayersp);
                	  }
                }
