
public class TreeEx_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedTree T = new LinkedTree();
		TreeNode n7 = T.makeBT(null, 'D', null);
		TreeNode n6 = T.makeBT(null, 'C', null);
		TreeNode n5 = T.makeBT(null, 'B', null);
		TreeNode n4 = T.makeBT(null, 'A', null);
		TreeNode n3 = T.makeBT(null, '/', n7);
		TreeNode n2 = T.makeBT(null, '*', n5);
		TreeNode n1 = T.makeBT(null, '-', n3);
		System.out.printf("\n preorder : ");
		T.preorder(n1);
		System.out.printf("\n Inorder : ");
		T.inorder(n1);
		System.out.printf("\n postorder : ");
		T.postorder(n1);
	}

}